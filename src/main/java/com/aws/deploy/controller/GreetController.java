package com.aws.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class GreetController {

    @GetMapping("/greet")
    public String greet(){
        return """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>AWS Deployment</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }

        body {
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: linear-gradient(135deg, #1e3c72, #2a5298);
            color: white;
        }

        .container {
            text-align: center;
            padding: 40px;
            border-radius: 15px;
            background: rgba(255, 255, 255, 0.1);
            backdrop-filter: blur(10px);
            box-shadow: 0 8px 30px rgba(0,0,0,0.3);
            animation: fadeIn 1.5s ease-in-out;
        }

        h1 {
            font-size: 2.5rem;
            margin-bottom: 15px;
        }

        p {
            font-size: 1.2rem;
            opacity: 0.9;
        }

        .badge {
            margin-top: 20px;
            display: inline-block;
            padding: 8px 15px;
            border-radius: 20px;
            background: #00c6ff;
            color: #000;
            font-weight: bold;
        }

        @keyframes fadeIn {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }
    </style>
</head>
<body>

    <div class="container">
        <h1>🚀 Spring Boot on AWS EC2</h1>
        <p>Your backend is successfully deployed and running live!</p>
        
        <div class="badge">Status: LIVE ✅</div>
    </div>

</body>
</html>
""";
    }
}
