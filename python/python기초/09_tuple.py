food1 = ("피자", "햄버거", "치킨", "라면", "된장찌개")
food2 = ["피자", "햄버거", "치킨", "라면", "된장찌개"]

food2[0] = "김치" # food1[0] = "김치" 불가능 왜? << 튜플은 안에있는 요소(값)을 수정할수없다.
print(food2)

food3 = ("피자", "햄버거", "치킨")
food4 = ("라면", "된장찌개")

food5 = food3 + food4

print(food5)

print(food3*3)