Abhay Suthar
GitHub: abhay3690

Features
Accepts a user’s problem query (POST /search-query)

Uses AI logic simulation to match relevant KB articles (hardcoded)

Generates a summary of matched articles

Includes input validation and exception handling

Ready to integrate with a frontend or service layer

[ firsr reuest = 

request :
{
  "userQuery": "reset password"
}
response : 
{
    "aiSummaryAnswer": "Found 1 relevant article(s): How to reset password in your local.",
    "matchedArticles": ["How to reset password in your local."]
}
]

[ second reuest = 

request :
{
  "userQuery": "vpn issue"
}
response : 
{
    "aiSummaryAnswer": "Found 1 relevant article(s): Troubleshooting VPN connectivity problems.",
    "matchedArticles": ["Troubleshooting VPN connectivity problems."]
}
]
[ third reuest = 

request :
{
  "userQuery": "email not working"
}
response : 
{
    "aiSummaryAnswer": "Found 1 relevant article(s): Steps to fix email access issues.",
    "matchedArticles": ["Steps to fix email access issues."]
}
]
