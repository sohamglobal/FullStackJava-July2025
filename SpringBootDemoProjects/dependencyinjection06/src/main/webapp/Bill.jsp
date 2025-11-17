<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SohamGlobal - Customer Bill</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #6627aa, #6790d7);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 20px;
            color: white;
        }
        .bill-card {
            background: rgba(223, 131, 131, 0.15);
            padding: 25px;
            border-radius: 20px;
            backdrop-filter: blur(10px);
            width: 100%;
            max-width: 500px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.25);
        }
        .heading {
            font-size: 32px;
            font-weight: bold;
            text-align: center;
            margin-bottom: 20px;
            text-transform: uppercase;
        }
        .label-icon {
            font-size: 22px;
            margin-right: 5px;
            color: #ffe600;
        }
        .back-link {
            color: #ffea00;
            font-weight: bold;
            text-decoration: none;
            font-size: 18px;
        }
        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>

<body>

    <div class="bill-card">
        <div class="heading">
            <i class="bi bi-shop-window"></i> SohamGlobal Bill
        </div>

        <div class="mb-3">
            <i class="bi bi-person-circle label-icon"></i>
            <strong>Customer Name:</strong> <span id="customerName">${name}</span>
        </div>

        <div class="mb-3">
            <i class="bi bi-cash-coin label-icon"></i>
            <strong>Purchase Amount:</strong> ₹<span id="purchaseAmount">${amount}</span>
        </div>

        <div class="mb-3">
            <i class="bi bi-percent label-icon"></i>
            <strong>Discount:</strong> ₹<span id="discount">${discount}</span>
        </div>

        <div class="mb-3">
            <i class="bi bi-receipt-cutoff label-icon"></i>
            <strong>Net Bill:</strong> ₹<span id="netBill">${netbill}</span>
        </div>

        <div class="text-center mt-4">
            <a href="/" class="back-link">
                <i class="bi bi-arrow-left-circle"></i> Back to Home
            </a>
        </div>
    </div>

</body>
</html>
    