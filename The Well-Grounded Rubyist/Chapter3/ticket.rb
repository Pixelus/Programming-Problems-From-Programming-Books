class Ticket
  VENUES = ["Convention Center", "Fairgrounds", "Town Hall"]

  attr_reader :venue, :date
  attr_accessor :price

  def initialize(venue)
    if VENUES.include?(venue)
      @venue = venue
    else
      raise ArgumentError, "Unknown venue #{venue}"
    end
  end

  def date=(date)
    if date.length <= 10
      @date = "20#{date}"
    else
      raise "Please submit the date in the format 'yyyy-mm-dd'."
    end
  end

  def Ticket.most_expensive(*tickets)
    tickets.max_by(&:price)
  end

  def discount(num)
    @price = @price - (@price * num / 100.00)
  end
end

ticket = Ticket.new("Town Hall")
ticket.date = "13-11-12"
ticket.price = 63.00
puts "The ticket is for an event on #{ticket.date} at #{ticket.venue}."
puts "The ticket for #{ticket.venue} has been discounted 15% to $#{ticket.discount(15)}."
