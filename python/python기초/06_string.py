name = "경주"
job = "킹"
age = 15
print("안녕하세요. 내 이름은 "+ name + "입니다. " +
      "직업은 " + job + "입니다. " 
    "나이는 " + str(age) + "입니다.") 

print("안녕하세요. 내 이름은 %s입니다. 직업은 %s입니다. 나이는 %s입니다." %(name, job, age)) 

print("안녕하세요. 내 이름은 {0}입니다. 직업은 {1}입니다. 나이는 {2}입니다."
      .format(name, job, age))

print(f"안녕하세요. 내 이름은 {name}입니다. 직업은 {job}입니다. 나이는 {age}입니다.")
#이 포맷팅 방법이 가장 많이쓰인다..
