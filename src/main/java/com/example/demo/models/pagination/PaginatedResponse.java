package com.example.demo.models.pagination;

// import java.io.Serializable;
// import java.util.List;

// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.PageRequest;

// import lombok.Data;
// import lombok.NoArgsConstructor;

// @Data
// @NoArgsConstructor
// public class PaginatedResponse<T> implements Serializable {
//     private static final long serialVersionUID = 1L;

//     private List<T> items;

//     private PaginationInfo pageInfo;

//     public PaginatedResponse(PageRequest pageRequest, Page<T> page) {
//         this.pageInfo = PaginationInfo.builder()
//             .page(pageRequest.getPageNumber())
//             .perPage(pageRequest.getPageSize())
//             .totalPages(page.getTotalPages())
//             .totalItems(page.getTotalElements())
//             .hasNextPage(page.hasNext())
//             .hasPreviousPage(page.hasPrevious())
//             .build();
//         this.items = page.getContent();
//     }
// }
