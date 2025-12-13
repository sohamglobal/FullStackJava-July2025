<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Used Cars Portal | Home</title>


<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: linear-gradient(135deg, #0d6efd, #20c997);
        min-height: 100vh;
    }
    .navbar-brand {
        font-weight: 700;
        font-size: 1.4rem;
    }
    .card {
        border-radius: 18px;
        box-shadow: 0 6px 25px rgba(0,0,0,0.25);
    }
    .login-btn {
        background: linear-gradient(135deg, #0d6efd, #20c997);
        border: none;
        font-weight: 600;
    }
    .login-btn:hover {
        background: linear-gradient(135deg, #0b5ed7, #17a589);
    }
    .section-title {
        font-weight: 700;
    }
    footer {
        background-color: rgba(0,0,0,0.85);
        color: #fff;
        padding: 20px 0;
        margin-top: 40px;
    }
    .car-card:hover {
        transform: scale(1.03);
        transition: 0.3s;
    }
</style>


</head>

<body>

<!-- Navbar -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">
        <a class="navbar-brand" href="#"><i class="bi bi-car-front-fill"></i> Used Cars Portal</a>
        <span class="navbar-text text-light">Find Trusted Pre-Owned Cars</span>
    </div>
</nav>

<div class="container mt-5">
    <div class="row g-4">


    <!-- Login Section -->
    <div class="col-lg-4">
        <div class="card p-4">
            <h4 class="section-title mb-3"><i class="bi bi-person-lock"></i> Customer Login</h4>
            <form action="/login" method="post">
                <div class="mb-3">
                    <label class="form-label">Username</label>
                    <input type="text" class="form-control" name="username" autocomplete="off" required>
                </div>
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" class="form-control" name="password" required>
                </div>
                <button type="submit" class="btn login-btn w-100 text-white">
                    <i class="bi bi-box-arrow-in-right"></i> Login
                </button>
            </form>
        </div>
    </div>

    <!-- Cars Listing Section -->
    <div class="col-lg-8">
        <div class="card p-4">
            <h4 class="section-title mb-4"><i class="bi bi-car-front"></i> Available Used Cars</h4>

            <div class="row g-3">
                <!-- Sample Car Card -->
                <div class="col-md-6">
                    <div class="card car-card p-3">
                        <h5>Maruti Swift</h5>
                        <p class="mb-1"><i class="bi bi-calendar"></i> 2020</p>
                        <p class="mb-1"><i class="bi bi-fuel-pump"></i> Petrol</p>
                        <p class="mb-1"><i class="bi bi-speedometer2"></i> 35,000 km</p>
                        <h6 class="text-success">₹ 5,50,000</h6>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card car-card p-3">
                        <h5>Hyundai i20</h5>
                        <p class="mb-1"><i class="bi bi-calendar"></i> 2019</p>
                        <p class="mb-1"><i class="bi bi-fuel-pump"></i> Diesel</p>
                        <p class="mb-1"><i class="bi bi-speedometer2"></i> 42,000 km</p>
                        <h6 class="text-success">₹ 6,20,000</h6>
                    </div>
                </div>

                <div class="col-md-6">
                    <div class="card car-card p-3">
                        <h5>Tata Nexon</h5>
                        <p class="mb-1"><i class="bi bi-calendar"></i> 2021</p>
                        <p class="mb-1"><i class="bi bi-fuel-pump"></i> Petrol</p>
                        <p class="mb-1"><i class="bi bi-speedometer2"></i> 28,000 km</p>
                        <h6 class="text-success">₹ 8,40,000</h6>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
```

</div>

<!-- Footer -->

<footer class="mt-5">
    <div class="container text-center">
        <h5><i class="bi bi-building"></i> SohamGlobal Used Cars</h5>
        <p class="mb-1">Trusted Marketplace for Quality Pre-Owned Vehicles</p>
        <p class="mb-0">© 2025 SohamGlobal | Powered by Spring Boot & Bootstrap</p>
    </div>
</footer>

<!-- Bootstrap JS -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
