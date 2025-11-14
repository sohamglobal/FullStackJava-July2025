<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Film Details</title>

    <!-- Bootstrap CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Icons -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">

    <style>
        body {
            background: url('https://images.unsplash.com/photo-1517602302552-471fe67acf66?auto=format&fit=crop&w=1350&q=80') no-repeat center center fixed;
            background-size: cover;
            font-family: 'Segoe UI', sans-serif;
        }
        .overlay {
            background: rgba(0,0,0,0.7);
            min-height: 100vh;
            padding: 50px 0;
        }
        .film-card {
            background: #ffffffdd;
            border-radius: 20px;
            padding: 25px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.4);
            backdrop-filter: blur(5px);
        }
        .poster {
            border-radius: 15px;
            box-shadow: 0 6px 15px rgba(0,0,0,0.5);
        }
        footer {
            margin-top: 40px;
            color: #eee;
            text-align: center;
        }
    </style>
</head>

<body>

<div class="overlay">

    <div class="container">
        <div class="row justify-content-center">

            <div class="col-md-6">
                
                <!-- Film Card -->
                <div class="film-card">

                    <h2 class="text-center mb-4">
                        <i class="bi bi-film"></i> ${film.filmname}
                    </h2>

                    <!-- Poster -->
                    <div class="text-center mb-4">
                        <img src="film.png"
                             class="img-fluid poster" alt="Film Poster" height="50px">
                    </div>

                    <!-- Film Info -->
                    <p><i class="bi bi-camera-reels"></i> <strong>Genre:</strong> ${film.genre}</p>
                    <p><i class="bi bi-calendar-event"></i> <strong>Release Year:</strong> ${film.releaseyear}</p>
                    <p><i class="bi bi-person-video3"></i> <strong>Director:</strong>${film.director}</p>
                    <p><i class="bi bi-person-fill"></i> <strong>Actor:</strong> ${film.actor }</p>
                    <p><i class="bi bi-person-hearts"></i> <strong>Actress:</strong> ${film.actress}</p>
                    <p><i class="bi bi-star-fill text-warning"></i> <strong>IMDb Rating:</strong> ${film.imdbrating}</p>

                </div>
            </div>

        </div>

        <!-- Footer -->
        <footer>
            <p><i class="bi bi-emoji-smile"></i> Designed by Praffull | Filmy Showcase Page</p>
        </footer>
    </div>
</div>

</body>
</html>
