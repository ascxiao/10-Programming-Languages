<!DOCTYPE html>
<html>
<head>
    <title>Average Calculator</title>
</head>
<body>
    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Check if name and scores are submitted
        if (isset($_POST['name']) && isset($_POST['score1']) && isset($_POST['score2']) && isset($_POST['score3'])) {
            $name = $_POST['name'];
            $score1 = (float) $_POST['score1'];
            $score2 = (float) $_POST['score2'];
            $score3 = (float) $_POST['score3'];

            $average = ($score1 + $score2 + $score3) / 3;

            echo "<h2>Hello, $name</h2>";
            echo "<p>Your average score is: " . number_format($average, 2) . "</p>";
        } else {
            // Handling dynamic scores
            $name = $_POST['name'];
            $list_scores = [];

            foreach ($_POST['scores'] as $score) {
                if (is_numeric($score)) {
                    $list_scores[] = (float) $score;
                }
            }

            if (!empty($list_scores)) {
                $average_list = array_sum($list_scores) / count($list_scores);
                echo "<h2>Hello, $name</h2>";
                echo "<p>Your average score is: " . number_format($average_list, 2) . "</p>";
            }
        }

        echo "<a href='main.php'>Calculate again</a>";
    } else {
    ?>
    <h2>Average Calculator for Three Test Scores</h2>
    <form method="POST" action="">
        <label for="name">Name:</label><br>
        <input type="text" id="name" name="name" required><br>
        <label for="score1">Score 1:</label><br>
        <input type="number" step="0.01" id="score1" name="score1" required><br>
        <label for="score2">Score 2:</label><br>
        <input type="number" step="0.01" id="score2" name="score2" required><br>
        <label for="score3">Score 3:</label><br>
        <input type="number" step="0.01" id="score3" name="score3" required><br>
        <input type="submit" value="Calculate Average">
    </form>
    <?php
    }
    ?>
</body>
</html>
