 
a relative score of how confident the LLM thinks that should be the next token

LOGITS

SOFTMAX->PROBABILITIES

weighted random choice
    stamps 

TEMPERATURE
scaling operation 
Temperature = 1
Temperature = 2

More higher number in tenperature the random the choice
if temperature like ex 0.5 then book have the highest chance


https://docs.spring.io/spring-ai/reference/api/chat/openai-chat.html

When should I use temperature 
    - Creative answer higher the temperature 
    - 

TOP-P

Probability 

Dont use Top-P and Temperature together


Top-K
is count ; openAI does not support Top-K

LOGIT BIAS
Take whatever you want

Advisors
    Aspects in AOP similar
    LLMs
        3 Types
            Chat Memory advisor ( 51 state movie)
            Vector Store Chat Memory
            RAD Memory advisor 
                question answer advisor
                Retrieval Augmentation 
            Simple logging advisor
                Does not log the request and response, it just logs internal model spring works it


RAG

Embedding

Tools
Taking Action - Send an email, take action s

@Tool -> Spring 


@Tool(description="Get the current date and time in the users timezone ")
String getCurrentDateTime()
{
    
}
}
