package com.github.kunw9367.ideapluginlearn.services

import com.intellij.openapi.project.Project
import com.github.kunw9367.ideapluginlearn.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
