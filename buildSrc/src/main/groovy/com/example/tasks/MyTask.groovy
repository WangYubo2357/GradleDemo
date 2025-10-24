package com.example.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.Internal

/**
 * 自定义任务类示例
 * 演示如何在独立文件中定义 Gradle 任务
 */
class MyTask extends DefaultTask {
    // 在配置阶段捕获项目名称
    @Internal
    String projectName
    
    @TaskAction
    void doSomething() {
        println "MyTask: 执行自定义任务逻辑..."
        println "MyTask: 项目名称 = ${projectName}"
        println "MyTask: 任务完成！"
    }
}
