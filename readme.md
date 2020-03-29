# 目的
よく作るサーバサイドWebプロジェクトテンプレートを残す

# 構成
* Intellij IDE
* Kotlin
* Spring Boot Web
* Spring Boot JPA
* Flyway

## 注意点
### Gradle
gradle の実行環境は、Java8としておくこと。※2020/3/29時点  
また一度プロジェクト側の実行環境もJDK8に一度してビルドしないと、build.gradle.ktsのエラーが消えない。  
その後は、実行したいJDKに戻してOK。