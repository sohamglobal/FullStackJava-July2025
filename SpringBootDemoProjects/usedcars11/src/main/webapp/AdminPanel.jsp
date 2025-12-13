<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Admin Dashboard | Used Cars</title>

```
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Icons -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.css" rel="stylesheet">

<style>
    body {
        background: linear-gradient(135deg, #1e3c72, #2a5298, #1abc9c);
        min-height: 100vh;
    }
    .navbar {
        box-shadow: 0 4px 20px rgba(0,0,0,0.3);
    }
    .dashboard-title {
        font-weight: 700;
        color: #fff;
    }
    .admin-card {
        border-radius: 20px;
        box-shadow: 0 8px 25px rgba(0,0,0,0.25);
        transition: transform 0.3s, box-shadow 0.3s;
        cursor: pointer;
    }
    .admin-card:hover {
        transform: translateY(-8px) scale(1.03);
        box-shadow: 0 12px 35px rgba(0,0,0,0.4);
    }
    .icon-circle {
        width: 70px;
        height: 70px;
        border-radius: 50%;
        display: flex;
        align-items: center;
        justify-content: center;
        font-size: 2rem;
        color: #fff;
        margin-bottom: 15px;
    }
    .bg-add { background: linear-gradient(135deg, #198754, #20c997); }
    .bg-edit { background: linear-gradient(135deg, #0d6efd, #6610f2); }
    .bg-delete { background: linear-gradient(135deg, #dc3545, #fd7e14); }
    .bg-enquiry { background: linear-gradient(135deg, #6f42c1, #d63384); }
    .bg-list { background: linear-gradient(135deg, #0dcaf0, #20c997); }
    .bg-report { background: linear-gradient(135deg, #ffc107, #fd7e14); }
    footer {
        background: rgba(0,0,0,0.85);
        color: #fff;
        padding: 20px 0;
        margin-top: 50px;
    }
</style>
```

</head>

<body>

<!-- Navbar -->

<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand fw-bold" href="#"><i class="bi bi-speedometer2"></i> Admin Panel</a>
        <span class="navbar-text text-light">Used Cars Management System</span>
    </div>
</nav>

<div class="container mt-5">
    <h2 class="dashboard-title text-center mb-5">
        <i class="bi bi-gear-fill"></i> Admin Dashboard
    </h2>

```
<div class="row g-4">
    <!-- Add Car -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-add"><i class="bi bi-car-front-fill"></i></div>
            <h5>Add Car</h5>
            <p>Add new used car details</p>
            <a href="newcar" class="btn btn-success">Open</a>
        </div>
    </div>

    <!-- Modify Car -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-edit"><i class="bi bi-pencil-square"></i></div>
            <h5>Modify Car Info</h5>
            <p>Edit existing car details</p>
            <a href="/admin/edit-car" class="btn btn-primary">Open</a>
        </div>
    </div>

    <!-- Delete Car -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-delete"><i class="bi bi-trash-fill"></i></div>
            <h5>Delete Car</h5>
            <p>Remove car from inventory</p>
            <a href="/admin/delete-car" class="btn btn-danger">Open</a>
        </div>
    </div>

    <!-- Add Enquiry -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-enquiry"><i class="bi bi-chat-dots-fill"></i></div>
            <h5>Add Enquiry</h5>
            <p>Register customer enquiry</p>
            <a href="newenq" class="btn btn-secondary">Open</a>
        </div>
    </div>

    <!-- Car List -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-list"><i class="bi bi-list-ul"></i></div>
            <h5>Car List</h5>
            <p>View all used cars</p>
            <a href="/admin/cars" class="btn btn-info">Open</a>
        </div>
    </div>

    <!-- Enquiry List -->
    <div class="col-md-4">
        <div class="card admin-card p-4 text-center">
            <div class="icon-circle bg-report"><i class="bi bi-journal-text"></i></div>
            <h5>Enquiry List</h5>
            <p>View customer enquiries</p>
            <a href="/admin/enquiries" class="btn btn-warning">Open</a>
        </div>
    </div>
</div>
```

</div>

<!-- Footer -->

<footer class="text-center">
    <div class="container">
        <h6 class="mb-1"><i class="bi bi-building"></i> SohamGlobal Used Cars</h6>
        <p class="mb-0">Admin Console | Powered by Spring Boot & Bootstrap</p>
    </div>
</footer>

<!-- Bootstrap JS -->

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
