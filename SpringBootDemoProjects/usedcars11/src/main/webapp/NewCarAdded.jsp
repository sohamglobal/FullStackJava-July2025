<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Car Added Successfully</title>

```
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: linear-gradient(135deg, #0d6efd, #20c997);
        min-height: 100vh;
        display: flex;
        align-items: center;
        justify-content: center;
    }
    .success-card {
        border-radius: 22px;
        box-shadow: 0 10px 35px rgba(0,0,0,0.35);
        animation: fadeIn 0.8s ease-in-out;
    }
    @keyframes fadeIn {
        from { opacity: 0; transform: translateY(20px); }
        to { opacity: 1; transform: translateY(0); }
    }
    .icon-success {
        font-size: 4rem;
        color: #198754;
    }
    .btn-custom {
        background: linear-gradient(135deg, #0d6efd, #20c997);
        border: none;
        font-weight: 600;
    }
    .btn-custom:hover {
        background: linear-gradient(135deg, #0b5ed7, #17a589);
    }
</style>
```

</head>

<body>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-7">
            <div class="card success-card p-5 text-center">
                <div class="mb-4">
                    <i class="bi bi-check-circle-fill icon-success"></i>
                </div>
                <h2 class="text-success fw-bold">Car Added Successfully!</h2>
                <p class="lead mt-3">
                    The new used car details have been saved in the system.
                </p>

```
            <hr class="my-4">

            <!-- Optional dynamic values via Thymeleaf -->
            <p class="mb-1"><strong>Brand:</strong> <span th:text="${car.brand}">Hyundai</span></p>
            <p class="mb-1"><strong>Model:</strong> <span th:text="${car.model}">i20</span></p>
            <p class="mb-1"><strong>Price:</strong> ₹ <span th:text="${car.price}">650000</span></p>
            <p class="mb-3"><strong>Status:</strong> <span class="badge bg-success" th:text="${car.status}">AVAILABLE</span></p>

            <div class="d-flex justify-content-center gap-3 mt-4">
                <a href="/admin/add-car" class="btn btn-custom text-white px-4">
                    <i class="bi bi-plus-circle"></i> Add Another Car
                </a>
                <a href="/admin/dashboard" class="btn btn-outline-primary px-4">
                    <i class="bi bi-speedometer2"></i> Dashboard
                </a>
                <a href="/admin/cars" class="btn btn-outline-success px-4">
                    <i class="bi bi-list-ul"></i> View Cars
                </a>
            </div>
        </div>
    </div>
</div>
```

</div>

<!-- Bootstrap JS -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>






</body>
</html>