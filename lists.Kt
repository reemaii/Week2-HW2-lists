fun main() {
    
    // Read-only (immutable)
    val names = listOf("Ahad", "Turki", "Raghad", "Nasser", "Sumayah", "Fahdah")
    val namesAll = listOf("Ahad", "Turki", "Raghad", "Nasser")
    val color = listOf<String>()
    
    // Read and Write (mutable)
    val numbers = mutableListOf("one", "two", "three", "four", "five")
    val weekDays = mutableListOf("Sun", "Mon", "Tue", "Wed", "Thurs", "Fri", "Sat")

    
    // Read-Write (mutable) List - Operations
    
    
    // Add (Element)
    numbers.add("six")
    println("$numbers\n***************************************")
   	
    // Add (Index, Element)
   	numbers.add(2,"nine")
    println("$numbers\n***************************************")
    
    // Add All (List)
    numbers.addAll(weekDays)
     println("$numbers\n***************************************")
     
    // Add All (Index, List)
    numbers.addAll(2,weekDays)
    println("$numbers\n***************************************")
    
    // Clear 
   	numbers.clear()
    println("$numbers\n***************************************")
    
    // Remove
    weekDays.removeAt(2)
    println("$weekDays\n***************************************")
    
    // Remove At 
     weekDays.remove("Sun")
    println("$weekDays\n***************************************")
    
    // Remove All
   	 weekDays.removeAll(weekDays)
    println("$weekDays\n***************************************")
    
    // Read-only (immutable) List - Operations
     
     
    // The size of the list
    val namesize= names.size
    println("$namesize\n***************************************")
    
     val nameallsize= namesAll.size
    println("$nameallsize\n***************************************")
    
    // Contains
    
    println(names.contains("Ahad"))
   	println("\n***************************************")
    // Contains All
   	println(names.containsAll(namesAll))
    println("\n***************************************")
    // get
   	println(names.get(3))
    println("\n***************************************")
    // indexOf
    println(names.indexOf("Nasser"))
    println("\n***************************************")
    // isEmpty
    println(names.isEmpty())
    println(color.isEmpty())
    println("\n***************************************")
    
    // Sublist
    println(names.subList(1,3))
    
    
}
