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
    <title>Enquiry Submitted Successfully</title>

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
        padding: 30px;
    }
    .success-card {
        border-radius: 22px;
        box-shadow: 0 10px 35px rgba(0,0,0,0.35);
        animation: zoomIn 0.7s ease-in-out;
    }
    @keyframes zoomIn {
        from { opacity: 0; transform: scale(0.9); }
        to { opacity: 1; transform: scale(1); }
    }
    .success-icon {
        font-size: 4.5rem;
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
        <div class="col-md-7 col-lg-6">
            <div class="card success-card p-5 text-center">

```
            <div class="mb-4">
                <i class="bi bi-check-circle-fill success-icon"></i>
            </div>

            <h2 class="text-success fw-bold">Enquiry Added Successfully!</h2>
            <p class="lead mt-3">
                Thank you. The customer enquiry has been recorded in the system.
            </p>

            <hr class="my-4">

            <!-- Dynamic details (Spring Boot + Thymeleaf ready) -->
            <p class="mb-1"><strong>Customer Name:</strong> <span>${enquiry.customerName}</span></p>
            <p class="mb-1"><strong>Mobile:</strong> <span>${enquiry.mobile}</span></p>
            <p class="mb-1"><strong>Enquiry Date:</strong> <span>{enquiry.enquiryDate}</span></p>

            <div class="mt-4 d-flex justify-content-center gap-3">
                <a href="/enquiry/new" class="btn btn-custom text-white px-4">
                    <i class="bi bi-plus-circle"></i> Add New Enquiry
                </a>
                <a href="/admin/enquiries" class="btn btn-outline-primary px-4">
                    <i class="bi bi-list-ul"></i> View Enquiries
                </a>
                <a href="/admin/dashboard" class="btn btn-outline-success px-4">
                    <i class="bi bi-speedometer2"></i> Dashboard
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