<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Glycemia Readings</title>
    <script src="https://cdn.jsdelivr.net/npm/chart.js"></script>
</head>
<body>

<a href="${pageContext.request.contextPath}/add">Add register</a>

<h1>Glycemia Readings</h1>
<div>
    <canvas id="myChart"></canvas>
</div>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const readings = JSON.parse('${readingsJson}');

        const labels = readings.map(reading => reading.date);
        const data = readings.map(reading => reading.level);

        const ctx = document.getElementById('myChart').getContext('2d');

        new Chart(ctx, {
            type: 'bar',
            data: {
                labels: labels,
                datasets: [{
                    label: 'Glycemia Level',
                    data: data,
                    borderWidth: 1
                }]
            },
            options: {
                scales: {
                    y: {
                        beginAtZero: true
                    }
                }
            }
        });
    });
</script>

</body>
</html>
