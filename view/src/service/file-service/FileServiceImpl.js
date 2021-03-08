/**
 * 文件服务实现类
 * @author xingchen
 **/
import FileService from "./FileService";
import Axios from "axios";

class FileServiceImpl extends FileService {
    /**
     * 文件上传
     * @param file 上传的文件对象
     */
    upload(file) {
        const url = "/api/file/upload";
        return Axios.post(url, file, {
            headers: {
                "accept": "multipart/form-data",
            }
        });
    }
}

export default FileServiceImpl;