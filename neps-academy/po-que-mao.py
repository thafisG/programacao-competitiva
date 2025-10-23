def main():
    N = int(input())  
    X = int(input())
    Y = int(input())
    Z = int(input())
    
    custos = [X, Y, Z]
    custos.sort()
    
    contagem = 0
    for custo in custos:
        if N >= custo:
            N -= custo
            contagem += 1
        else:
            break
    
    print(contagem)

if __name__ == "__main__":
    main()
