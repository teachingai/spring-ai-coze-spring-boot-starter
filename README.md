# spring-ai-coze-spring-boot-starter

> 基于 [Core](https://www.coze.com/) 和 Spring AI 的 Spring Boot Starter 实现


### Coze

Coze 是新一代一站式 AI Bot 开发平台。无论你是否有编程基础，都可以在 Coze 平台上快速搭建基于 AI 模型的各类问答 Bot。而且你可以将搭建的 Bot 发布到各类社交平台和通讯软件上，让更多的用户与你搭建的 Bot 聊天。
Coze 支持将 AI chat bot 发布为 API 服务，你可以通过 HTTP 方式与 bot 进行交互。

- 官网地址：[https://www.coze.com](https://www.coze.com/)
- API文档：[https://www.coze.com/docs/developer_guides/coze_api_overview](https://www.coze.com/docs/developer_guides/coze_api_overview?_lang=zh)

#### 关键概念

##### Token

> Token 是模型用来表示自然语言文本的基本单位，可以直观的理解为“字”或“词”；通常 1 个中文词语、1 个英文单词、1 个数字或 1 个符号计为 1 个token。 一般情况下 ChatGLM 系列模型中 token 和字数的换算比例约为 1:1.6 ，但因为不同模型的分词不同，所以换算比例也存在差异，每一次实际处理 token 数量以模型返回为准，您可以从返回结果的 usage 中查看。

#### 支持的功能包括：

- 支持文本生成（Chat Completion API）
- 支持多轮对话（Chat Completion API），支持返回流式输出结果

### Maven

``` xml
<dependency>
	<groupId>com.github.teachingai</groupId>
	<artifactId>spring-ai-coze-spring-boot-starter</artifactId>
	<version>${project.version}</version>
</dependency>
```

### Sample

使用示例请参见 [Spring AI Examples](https://github.com/TeachingAI/spring-ai-examples)


### License

[Apache License 2.0](
