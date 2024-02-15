plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}
rootProject.name = "ProgramaccioObjectes"
include("src:main:UML")
findProject(":src:main:UML")?.name = "UML"
