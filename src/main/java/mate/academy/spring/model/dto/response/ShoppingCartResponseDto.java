package mate.academy.spring.model.dto.response;

import java.util.List;

public class ShoppingCartResponseDto {
    private Long id;
    private List<Long> ticketId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getTicketId() {
        return ticketId;
    }

    public void setTicketId(List<Long> ticketId) {
        this.ticketId = ticketId;
    }
}
