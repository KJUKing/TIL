user = {"name" : "경주", "job" : "King", "email" : "kyungjurhdqn@gmail.com"}
#{"키" : "밸류"}
print(user["name"])

user["age"] = 20
print(user)

del user["name"]
print(user)

user["age"] = 25 #age 키값에 25추가시 추가되는게아니라 20에서 25으로 덮어씌어진다
print(user)

keys_list =user.keys() #키값만 모아둔것을 선언
keys_list = list(keys_list) # 클래스를 dics에서 list화
#결국에는 리스트화를 왜시키냐?? << 리스트의 append나 insert를 사용하고싶으면 리스트화를 시켜도된다.

print(keys_list) #키만 나오기
print(type(keys_list))

value_list = user.values()

print(value_list) #값만 나오기
print(type(value_list)) 

item_list = user.items()
item_list = list(item_list)

print(item_list) #아이템 메소드는 키 밸류 동시에 다나오는것
print(type(item_list))

print(item_list[0])
print(type(item_list[0])) #튜플 클래스출력

