BFS(startNode):
    Create a boolean array visited[] to mark visited nodes
    Create an empty queue Q

    Mark startNode as visited
    Enqueue startNode into Q

    while Q is not empty:
        current = dequeue from Q
        print(current)   // or process it

        for each neighbor of current:
            if neighbor is not visited:
                mark neighbor as visited
                enqueue neighbor
