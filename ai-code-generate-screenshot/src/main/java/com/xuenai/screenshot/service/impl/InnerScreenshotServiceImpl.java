package com.xuenai.screenshot.service.impl;

import com.xuenai.aicodegenerate.innerservice.InnerScreenshotService;
import com.xuenai.screenshot.service.ScreenshotService;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class InnerScreenshotServiceImpl implements InnerScreenshotService {

    @Resource
    private ScreenshotService screenshotService;


    @Override
    public String generateAndSaveScreenshot(String webUrl) {
        return screenshotService.generateAndSaveScreenshot(webUrl);
    }
}

