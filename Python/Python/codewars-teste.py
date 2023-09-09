def is_triangle(a, b, c):
    cond1 = abs(b-c)
    cond2 = abs(a-c)
    cond3 = abs(a-b)
    if (a > 0) and (b > 0) and (c > 0):
        print('todos os números > 0')
        print(cond3)
        if (cond1 < a < b +c) and (cond2 < b < c + a) and (cond3 < c < a + b):
            print("cumpre todos as cond de trian")
            return True
        else:
            print(" n cumpre todos as cond de trian - false")
            return False
    else: return False

print(is_triangle(1,2,2))