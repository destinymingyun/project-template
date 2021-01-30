/**
 * webpack配置类
 **/
const path = require("path");
const HtmlWebpackPlugin = require("html-webpack-plugin");
const {CleanWebpackPlugin} = require("clean-webpack-plugin");
const VueLoaderPlugin = require("vue-loader/lib/plugin");

module.exports = {
    //  设置开发/生产模式
    mode: "development",
    //  入口文件
    entry: "./src/main.js",
    //  输出文件
    output: {
        //  输出文件路径
        path: path.resolve(__dirname, "dist"),
        //  文件名
        filename: "[main].[contenthash].js",
    },
    //  文件解析
    module: {
        rules: [
            // ... vue
            {
                test: /\.vue$/,
                loader: "vue-loader",
            },
            //  less文件
            {
                test: /\.less$/,
                use: [
                    "style-loader",
                    "css-loader",
                    "less-loader",
                ],
            },
        ]
    },
    //  插件
    plugins: [
        //  html模板插件
        new HtmlWebpackPlugin({
            title: "xingchen-project-view",
            template: "./index.html",
        }),
        //  dist文件夹缓存清除
        new CleanWebpackPlugin(),
        //  vue-单文件解析
        new VueLoaderPlugin(),
    ],
    //  简易开发服务器
    devServer: {
        //  服务器文件地址
        contentBase: "./dist",
        //  热部署
        hot: true,
        //  代理(解决跨域)
        proxy: {
            "/api": {
                target: "http://localhost:10000",
            }
        },
        port: 25565,
    },
    //  错误显示源码
    devtool: "inline-source-map",
    //  解析配置
    resolve: {
        //  别名配置
        alias: {
            "__style__": path.resolve(__dirname, "res/less"),
            "__tpage__": path.resolve(__dirname, "src/t-page"),
            "__router__":path.resolve(__dirname, "src/router"),

        }
    },
};