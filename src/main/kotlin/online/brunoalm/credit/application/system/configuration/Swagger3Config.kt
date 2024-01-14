package online.brunoalm.credit.application.system.configuration


import org.springdoc.core.customizers.OpenApiCustomizer
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class Swagger3Config {
    @Bean
    fun publicApi(): GroupedOpenApi? {
        return GroupedOpenApi.builder()
            .group("springcreditapplicationsystem-public")
            .addOpenApiCustomizer {
                it.info.title = "Credit Application System"
                it.info.description = "Projeto da DIO de Spring API com Kotlin"
                it.info.version = "0.1.0"
            }
            .pathsToMatch("/api/customers/**", "/api/credits/**")
            .build()
    }
}