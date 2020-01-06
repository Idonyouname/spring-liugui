package com.liugui.springvideoutil;

import com.liugui.springvideoutil.util.VideoUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @ClassName: FileController
 * @Author: liugui
 * @Date: 2020-01-06 16:30
 **/
@RestController
@Api("file测试控制器")
public class FileController {

    @ApiOperation("测试VideoUtil")
    @PostMapping("/fileTest")
    public String fileTest(@RequestParam("file") MultipartFile file){
        return VideoUtil.readVideoTimeMs(file);
    }

}
