food = ["피자","햄버거","감자튀김","김치","삼겹살"]

print(food[0:2])

food2 = ["햄버거", "감자튀김"]

food3 = food + food2

print(food3)

any = [100, ["햄버거","감자튀김"],"김치","삼겹살"]

print(any[1][0]) #리스트안에 리스트를 출력가능

######################################################################

food4 = ["김치", "삼겹살"]

food4.append("피자")

print(food4)

food4.insert(1, "치킨")

print(food4)

food4.remove("김치") # 만약에 김치가 2개면 [김치, 삼겹살, 김치면] 0번째 김치만 삭제됨

print(food4)

food4[2] = "강낭콩" #3번째 자리를 강낭콩으로 수정하는것

print(food4)

print(food4.index("삼겹살")) #count는 몇개있는지 알아내는것

food4.sort()  # 글자 순서대로 출력됨 ㄱㄴㄷ순

#food.sort(reverse=True) << 거꾸로 정렬 나오게하는법

print(food4)
