/**
 * 组件全局配置
 **/
import Vue from "vue";
import TMessage from "__tcomponent__/t-message";

const MessageConstructor = Vue.extend(TMessage);

/**
 * 自动生成message消息组件
 * @param text 显示文本
 * @param mode 应用场景模式
 * @param time 停留时间，以毫秒计算，默认5秒，
 */
Vue.prototype.$message = (text, mode, time=5000) => {
    let message = new MessageConstructor({
        data: {
            text,
            mode,
            time,
        }
    });
    document.body.appendChild(message.$mount().$el);
}