package com.nine.cloud.nacos.discovery;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * Create by Jarvis.wang on Jarvis's device
 *
 * @author Jarvis.wang  Jarvis
 * @date 2019-02-18 10:39
 */
@Configuration
@RefreshScope
@EnableDiscoveryClient
public class NineNacosDiscoveryServerConfig {
}
