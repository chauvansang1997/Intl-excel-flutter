package com.github.chauvansang1997.intlexcelflutter.services

import com.github.chauvansang1997.intlexcelflutter.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
