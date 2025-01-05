def max_planks(wood):
    #
    freq = {}
    for piece in wood:
        freq[piece] = freq.get(piece, 0) + 1
    
    max_planks = 0
    
   
    for plank_length in freq.keys():
       
        current_planks = freq.get(plank_length, 0)
        
       
        for piece in freq.keys():
           
            complement = plank_length - piece
            if complement in freq and complement != piece:
                pair_planks = min(freq[piece], freq[complement])
                current_planks += pair_planks // 2
        
      
        max_planks = max(max_planks, current_planks)
    
    return max_planks


if __name__ == "__main__":
  
    wood = list(map(int, input("Enter the wood lengths, separated by spaces: ").split()))
    

    result = max_planks(wood)
    print(f"Maximum number of planks: {result}")


