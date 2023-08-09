for i in range(1,9) :
    if i % 2 == 0 :
        print(f"{i}는 짝수입니다")
    else :
        print(f"{i}는 홀수입니다")

print("================줄바꿈===============")


for i in range(1,16) :
    if i % 3 == 0 and i % 5 == 0:
        print(f"{i}는 3과 5의 배수입니다")
    elif i % 3 == 0 :
        print(f"{i}는 3의 배수입니다")
    elif i % 5 == 0: #타조건 붙힐때는 elif다 else는 정말 뭣도안남았을때 선택지가없는경우 마지막
        print(f"{i}는 5의 배수입니다")
