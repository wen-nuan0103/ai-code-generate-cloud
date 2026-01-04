package com.xuenai.intelligent.ai.config.properties;

import com.xuenai.intelligent.ai.config.AiModelConfig;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "langchain4j.gemini")
public class GeminiModelProperties {
    
    private AiModelConfig.ModelConfig reasoning;  // 推理模型


    
}
