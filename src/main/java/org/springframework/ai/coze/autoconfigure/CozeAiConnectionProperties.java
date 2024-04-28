package org.springframework.ai.coze.autoconfigure;

import org.springframework.ai.coze.util.ApiUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(CozeAiConnectionProperties.CONFIG_PREFIX)
public class CozeAiConnectionProperties {

    public static final String CONFIG_PREFIX = "spring.ai.coze";

    /**
     * Base URL where Coze API server is running.
     */
    private String baseUrl = ApiUtils.DEFAULT_BASE_URL;

    private String apiKey;

    public String getApiKey() {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

}
