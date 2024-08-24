# 使用者管理系統

## 概述

這是一個基於 Spring Boot 開發的簡單使用者管理系統範例，旨在實現使用者的註冊、登入及用戶資訊的獲取功能。該項目包含了 RESTful API，用於註冊使用者、登入和通過 ID 獲取使用者詳情。系統同時整合了 Swagger 進行 API 文件生成，並使用 Spring Security 進行身份驗證。

## 功能特點

- **使用者註冊**: 註冊新使用者並對密碼進行加密存儲。
- **使用者登入**: 使用基本身份驗證進行使用者身份驗證。
- **用戶資訊獲取**: 通過用戶 ID 獲取使用者詳情。
- **API 文件**: 使用 Swagger UI 進行 API 文檔的可視化展示。
- **安全性**: 使用 Spring Security 實現基本身份驗證。

## 使用技術

- **Spring Boot 3.3.2**: 應用程序的核心框架。
- **Spring Data JPA**: 用於數據庫訪問和 ORM 映射。
- **MySQL**: 後端數據庫。
- **Spring Security**: 用於應用程序的身份驗證和授權。
- **BCrypt**: 用於加密使用者密碼。
- **Swagger/OpenAPI**: 用於生成和展示 API 文檔。
- **Maven**: 項目構建工具。

## 項目結構

- `model`: 包含數據模型類別，如 `User`。
- `repository`: 包含數據訪問層，與數據庫進行交互。
- `service`: 包含業務邏輯層，如 `UserService` 和其實現類 `UserServiceImpl`。
- `controller`: 包含控制器層，負責處理 HTTP 請求並返回響應。
- `config`: 包含應用程序配置類，如 `SecurityConfig` 和 `SwaggerConfig`。

## 如何運行

1. 確保已經安裝了 Java 17 和 Maven。
2. 克隆此倉庫到本地環境。
3. 在項目根目錄下執行 `mvn clean install` 來構建項目。
4. 使用 `mvn spring-boot:run` 啟動應用程序。
5. 訪問 `http://localhost:8080/swagger-ui.html` 查看 Swagger UI。

## API 端點

- **POST /api/users/register**: 註冊新使用者。
- **POST /api/users/login**: 使用者登入。
- **GET /api/users/{id}**: 通過 ID 獲取使用者詳情。

## 注意事項

- 該項目目前僅為演示用途，未來版本中可能會進一步完善功能和代碼結構。
- 切勿在生產環境中使用默認的 Basic Auth 設置，請確保密碼加密與身份驗證方式的安全性。

