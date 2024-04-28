package org.springframework.ai.coze.autoconfigure;

import org.springframework.ai.coze.api.CozeAiApi;
import org.springframework.ai.coze.api.CozeAiChatOptions;
import org.springframework.ai.coze.util.ApiUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(CozeAiChatProperties.CONFIG_PREFIX)
public class CozeAiChatProperties {

    public static final String CONFIG_PREFIX = "spring.ai.coze.chat";


    /**
     * Enable ZhipuAi chat client.
     */
    private boolean enabled = true;

    /**
     * Client lever ZhipuAi options. Use this property to configure generative temperature,
     * topK and topP and alike parameters. The null values are ignored defaulting to the
     * generative's defaults.
     */
    @NestedConfigurationProperty
    private CozeAiChatOptions options = CozeAiChatOptions.builder()
            .withModel(CozeAiApi.ChatModel.GLM_3_TURBO.getValue())
            .withMaxToken(ApiUtils.DEFAULT_MAX_TOKENS)
            .withDoSample(Boolean.TRUE)
            .withTemperature(ApiUtils.DEFAULT_TEMPERATURE)
            .withTopP(ApiUtils.DEFAULT_TOP_P)
            .build();

    public CozeAiChatOptions getOptions() {
        return this.options;
    }

    public void setOptions(CozeAiChatOptions options) {
        this.options = options;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

}
