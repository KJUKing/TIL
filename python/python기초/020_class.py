class User:
    def __init__(self, name, age): #init이라는 메소드는 객체를만들면 자동으로 실행시켜주는것
        self.name = name
        self.age = age
    
    def hello(self):
        print(f"Hello~~!! My name is {self.name}")


user_1 = User("경주", 20)
user_2 = User("경주킹", 30)

user_1.hello()

print(user_1.name)
print(user_1.age)

user_2.hello()