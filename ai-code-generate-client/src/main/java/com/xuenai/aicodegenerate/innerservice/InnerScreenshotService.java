package com.xuenai.aicodegenerate.innerservice;

/**
 * 内部截图服务接口
 */
public interface InnerScreenshotService {

    /**
     * 截图并保存至 COS
     *
     * @param webUrl 需要截图网页
     * @return 图片访问地址
     */
    String generateAndSaveScreenshot(String webUrl);

}
