# import time

# for i in range(1,10) :
#     print(f"{i} : Hi!")
#     time.sleep(1)


import random
# x = random.random()
# print(x)
x = random.randint(1, 10)
print(x)

y = [1,2,3,4,5,6,7,8,9]

random.shuffle(y)
print(y)
z = random.choice(y)
print(z)
z1 = random.sample(y, 3)
print(z1)

import datetime
today = datetime.date.today()
print(today.year)

import os
print(os.getcwd())
print(os.listdir())