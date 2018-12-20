package com.growithus.service.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

import org.springframework.core.io.ClassPathResource;

/**
 * ClassName:ClassPathResourceReader <br/>
 * Function: 读取resource目录下的资源文件<br/>
 * Date: 2018年12月19日 下午3:57:28 <br/>
 * 
 * @author growithus
 * @version
 * @since JDK 1.6
 * @see
 */
public final class ClassPathResourceReader {

    /**
     * path:文件路径
     * 
     * @since JDK 1.8
     */
    private final String path;

    /**
     * content:文件内容
     * 
     * @since JDK 1.6
     */
    private String content;

    public ClassPathResourceReader(String path) {
        this.path = path;
    }

    /**
     * getContent: 获取内容 <br/>
     *
     * @author 
     * @return
     * @since JDK 1.8
     */
    public String getContent() {
        if (content == null) {
            try {
                ClassPathResource resource = new ClassPathResource(path);
                BufferedReader reader = new BufferedReader(new InputStreamReader(resource.getInputStream()));
                content = reader.lines().collect(Collectors.joining("\n"));
                reader.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
        return content;
    }
}
