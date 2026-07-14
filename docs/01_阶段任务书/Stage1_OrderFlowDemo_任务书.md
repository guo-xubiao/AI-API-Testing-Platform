# Stage 1：OrderFlow Demo 被测业务系统任务书

## 阶段目标

创建一个可被接口测试平台调用的订单履约 Demo 系统，逐步实现用户、商品、库存、订单、支付、取消、发货、完成、退款和订单状态流转校验等能力。

## 任务清单

1. Stage 1 - Task 1：创建 Spring Boot 项目骨架
2. Stage 1 - Task 2：设计统一响应与异常体系
3. Stage 1 - Task 3：设计订单系统领域模型
4. Stage 1 - Task 4：实现商品模块
5. Stage 1 - Task 5：实现用户注册与登录模块
6. Stage 1 - Task 6：实现创建订单接口
7. Stage 1 - Task 7：实现订单支付接口
8. Stage 1 - Task 8：实现订单取消接口
9. Stage 1 - Task 9：实现订单发货与完成接口
10. Stage 1 - Task 10：实现退款流程
11. Stage 1 - Task 11：补充订单状态流转校验
12. Stage 1 - Task 12：补充业务异常场景
13. Stage 1 - Task 13：完善 Swagger / OpenAPI 文档
14. Stage 1 - Task 14：整理 Stage 1 接口文档
15. Stage 1 - Task 15：Stage 1 阶段验收

## 当前任务

当前任务为 Stage 1 - Task 5：实现用户注册与登录模块。

## Stage 1 - Task 1：创建 Spring Boot 项目骨架

### 一、任务背景

后续所有订单业务接口都需要建立在一个可运行的 Spring Boot 项目之上。因此第一步只创建最小项目骨架，不提前实现业务模块。

### 二、任务目标

创建 `orderflow-demo` 项目，完成基础包结构、H2 配置、统一响应对象和健康检查接口。

### 三、前置条件

暂无。

### 四、你需要完成什么

- 创建 Maven + Spring Boot 项目。
- 创建基础包结构。
- 配置 `application.yml`。
- 创建统一响应对象 `ApiResponse`。
- 创建健康检查接口 `HealthController`。

### 五、具体要求

- 项目目录：`orderflow-demo`
- 基础包名：`com.example.orderflowdemo`
- 服务端口：`8081`
- 健康检查接口：`GET /api/health`
- 健康检查成功返回：

```json
{
  "code": 0,
  "message": "success",
  "data": "OrderFlow Demo is running"
}
```

### 六、禁止提前做什么

- 不实现用户注册、登录、商品、订单、支付、退款等业务接口。
- 不接入 AI。
- 不创建接口测试平台前端。
- 不设计完整数据库模型。

### 七、验收标准

- `orderflow-demo/pom.xml` 存在，且是 Spring Boot Maven 项目。
- `application.yml` 配置了 `server.port=8081` 和 H2 基础配置。
- 主启动类存在。
- `ApiResponse` 存在，并支持成功响应。
- `HealthController` 存在，并提供 `GET /api/health`。
- 健康检查接口使用统一响应格式。

### 八、你需要提交什么

- 项目结构。
- `pom.xml`。
- `application.yml`。
- `ApiResponse`。
- `HealthController`。
- 如果已运行项目，提交健康检查接口返回结果。

### 九、常见错误

- 健康检查接口直接返回字符串，没有使用统一响应对象。
- 提前实现后续业务模块。
- 包名和目录结构不一致。
- 端口不是 `8081`。

### 十、通过后进入哪一题

Stage 1 - Task 2：设计统一响应与异常体系。


