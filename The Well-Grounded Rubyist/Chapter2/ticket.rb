ticket = Object.new

def ticket.date
 "2003-02-01"
end
def ticket.venue
 "Town Hall"
end
def ticket.event
 "Author's reading"
end
def ticket.performer
 "Mark Twain"
end
def ticket.seat
 "Second Balcony, row J, seat 12"
end
def ticket.price
 5.50
end
def ticket.print_details(*x)
    x.each { |detail| puts "The ticket is #{detail}."}
end

puts "This ticket is for: #{ticket.event}, at #{ticket.venue}.\n" +
 "The performer is #{ticket.performer}.\n" +
 "The seat is #{ticket.seat}, " +
 "and it costs $#{"%.2f." % ticket.price}"
ticket.print_details("non-refundable", "non-transferable", "is in a non-smoking section")
