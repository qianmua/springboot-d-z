package pres.hjc.dubbo.file;

import com.github.tobato.fastdfs.domain.StorePath;
import com.github.tobato.fastdfs.service.FastFileStorageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author HJC
 * @version 1.0
 * To change this template use File | Settings | File Templates.
 * @date 2020/4/24
 * @time 18:21
 */
public class FileUoloadController {


    @Autowired
    private FastFileStorageClient fastFileStorageClient;


    @GetMapping("upload")
    public String fileUpload(){
        try {
            File file = new File("path");
            FileInputStream inputStream = new FileInputStream(file);
            String name = file.getName();
            String sufName = name.substring(name.lastIndexOf(".") +1) ;

            StorePath storePath = fastFileStorageClient.uploadFile(inputStream, file.length(), sufName, null);

            //返回路径名
            System.out.println(storePath.getPath());
            //组名
            System.out.println(storePath.getGroup());
            //组名 + 路径名
            System.out.println(storePath.getFullPath());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return "";
    }
}
