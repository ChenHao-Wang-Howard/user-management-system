# User Management System

這個專案是一個用於用戶管理的系統，包括用戶註冊、登入、查看用戶資料等基本功能。前端使用 Vue 3 和 Pinia，後端基於 Spring Boot 3。專案目標是實現一個完整的前後端應用，並進行 JWT 認證和 API 安全性配置。

## 項目結構

```plaintext
user-management-system/
├── backend/                    # 後端 Spring Boot 專案
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com.howard.backend/
│   │   │   │       ├── config/        # Spring Security 和其他配置
│   │   │   │       ├── controller/    # 控制器層，處理 HTTP 請求
│   │   │   │       ├── model/         # 實體類，對應數據庫表
│   │   │   │       ├── repository/    # Spring Data JPA 儲存庫
│   │   │   │       ├── service/       # 服務層，業務邏輯
│   │   │   │       └── service/impl/  # 服務層實現
│   │   │   └── resources/
│   │   │       ├── application.properties  # 應用配置文件
│   │   │       └── ehcache.xml      # Ehcache 配置（如使用 Ehcache）
│   ├── pom.xml                      # Maven 配置文件
├── frontend/                   # 前端 Vue 3 專案
│   ├── public/
│   ├── src/
│   │   ├── api/                # 與後端 API 交互的 Axios 設定
│   │   ├── assets/             # 靜態資源（圖片等）
│   │   ├── components/         # Vue 組件
│   │   ├── router/             # Vue Router 配置
│   │   ├── stores/             # Pinia 狀態管理
│   │   ├── views/              # 視圖頁面
│   │   └── App.vue             # 主應用組件
│   ├── package.json            # 前端依賴配置文件
└── README.md                   # 專案說明文件
```

## 目前已完成的技術

### 後端

1. **Spring Boot 3**: 使用 Spring Initializr 生成的項目。
2. **Spring Security**: 配置了基本的 HTTP Basic 認證。
3. **Spring Data JPA**: 實現基本的 CRUD 操作。
4. **Hibernate**: 配置了 Hibernate 進行 ORM 映射。
5. **Log4j/SLF4J**: 使用 Log4j 或 SLF4J 進行日誌記錄。
6. **CORS 配置**: 配置了 CORS 來允許跨域請求。
7. **Ehcache/Caffeine**: 實現了簡單的緩存（如需要）。
8. **OpenAPI (Swagger)**: 提供 API 文檔生成。

### 前端

1. **Vue 3**: 前端框架，負責構建用戶界面。
2. **Pinia**: 狀態管理，用於管理全局狀態。
3. **Vue Router**: 設置了基本的路由結構。
4. **Axios**: 用於與後端 API 進行 HTTP 請求。
5. **JWT 認證**: 設置了基於 JWT 的前端認證機制（待完善）。

## 未來計畫的技術

1. **角色和權限管理**: 配置基於角色的權限控制。
2. **前端完整的 UI/UX 優化**: 使用 Vuetify 或 Ant Design Vue 進行頁面設計。
3. **JWT 認證完成**: 完成 JWT token 的生成和驗證流程。
4. **API 安全性加強**: 加強 API 安全性，包括使用 JWT token 進行認證。
5. **自動化測試和部署**: 使用 GitHub Actions 進行 CI/CD，並將項目部署到雲端（AWS 或 Azure）。

## 安裝與運行

### 後端

1. **克隆儲存庫**：
    ```bash
    git clone https://github.com/Howard-yzu/user-management-system.git
    cd user-management-system/backend
    ```

2. **構建和運行**：
    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

### 前端

1. **導航到前端目錄**：
    ```bash
    cd ../frontend
    ```

2. **安裝依賴**：
    ```bash
    npm install
    ```

3. **運行開發伺服器**：
    ```bash
    npm run dev
    ```

## API 文檔

後端 API 文檔可以通過 Swagger UI 訪問，通常在後端啟動後訪問 [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)。

