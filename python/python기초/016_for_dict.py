user_data = {"name" : "경주", "age" : 20, "email" : "kyungjurhdqn@gmail.com"}

# 1
# for data in user_data :
#     print(f"{data} : {user_data[data]}")

#2
for data in user_data.items():
    print (f"{data[0]}",f"{data[1]}")
