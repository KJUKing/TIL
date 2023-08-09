def add(a,b) :
    print(f"{a}와 {b}를 입력받았습니다.")
    print(f"두 값을 더하면 {a+b}입니다.")

    return a+b # 리턴값을 생략하면 none을 반환하므로 temp를 print시 none출력한다

temp = add(5,10)
print(temp)