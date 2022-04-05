## 扩展点+责任链的业务开发模式
业务X的全部可能步骤：`A -> B -> C -> D`

### 步骤本身用扩展点
> `Xi`是`X`的相似业务，`Ai`是`A`的扩展点  
- 业务X1：`A1 -> B1 -> D1`  
- 业务X2：`A2 -> B1 -> D2`
- 业务X3：`A1 -> B2 -> C1 -> D1`

### 步骤内用责任链
- `A = {h1, h2, h3}`
- `A1 = h1 + h2`
- `A2 = h1 + h2 + h3`

## cora的流程编排

`create -> deliver -> submit (-> cancel) -> settle`

用`requestId`串联整个流程