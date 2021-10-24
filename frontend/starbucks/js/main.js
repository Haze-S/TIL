// 검색창 이벤트
const searchEl = document.querySelector('.search');
const searchInputEl = searchEl.querySelector('input');

searchEl.addEventListener('click', function () {
  searchInputEl.focus();
});
searchInputEl.addEventListener('focus', function () {
  searchEl.classList.add('focused');
  searchInputEl.setAttribute('placeholder', '통합검색');
});
searchInputEl.addEventListener('blur', function () {
  searchEl.classList.remove('focused');
  searchInputEl.setAttribute('placeholder', '');
});


const badgeEl = document.querySelector('header .badges');
const toTopEl = document.querySelector('#to-top');

// 페이지가 스크롤되면 뱃지 숨김 이벤트
window.addEventListener('scroll', _.throttle(function () {
  // _.throttle(함수, 시간)
  console.log(window.scrollY);
  if(window.scrollY > 500) {
    // 배지 숨기기
    // gsap.to(요소, 지속시간, {옵션});
    gsap.to(badgeEl, .4, {
      opacity: 0,
      display: 'none'
    });
    // 버튼 보이기
    gsap.to(toTopEl, .2, {
      x: 0
    });
  } else {
    // 배지 보이기
    gsap.to(badgeEl, .4, {
      opacity: 1,
      display: 'block'
    });
    // 버튼 숨기기
    gsap.to(toTopEl, .2, {
      x: 100
    });
  }
}, 300));

// top 버튼을 누르면 화면이 제일 상단으로 이동
toTopEl.addEventListener('click', function () {
  gsap.to(window, .7, {
    scrollTo: 0
  });
});


const fadeEls = document.querySelectorAll('.visual .fade-in');

// 비주얼 아이템 시간차로 보여지는 이벤트
fadeEls.forEach(function (fedeEl, index) {
  gsap.to(fedeEl, 1, {
    delay: (index + 1) * .7, // 0.7, 1.4, 2.1, 2.7
    opacity: 1
  });
});


// 배너 슬라이드 with Swiper 라이브러리
// new 생성자(선택자, 옵션)
new Swiper('.notice-line .swiper', {
  direction: 'vertical',
  autoplay: true,
  loop: true
})
new Swiper('.promotion .swiper', {
  slidesPerView: 3, // 한번에 보여줄 슬라이드 개수
  spaceBetween: 10, // 슬라이드 사이 여백
  centeredSlides: true, // 1번 슬라이드가 가운데 보이기
  loop: true,
  autoplay: {
    delay: 4000
  },
  pagination: {
    el: '.promotion .swiper-pagination', // 페이지 번호 요소 선택자
    clickable: true // 사용자의 페이지 번호 요소 제어 가능 여부
  },
  navigation: {
    prevEl:'.promotion .swiper-prev',
    nextEl:'.promotion .swiper-next'
  }
});


// 배너 요소 나타내고 숨기는 이벤트
const promotionEl = document.querySelector('.promotion');
const promotionToggleBtn = document.querySelector('.toggle-promotion');
const promotionToggleBtnIcon = promotionToggleBtn.querySelector('.material-icons');
let isHidePromotion = false;
promotionToggleBtn.addEventListener('click', function () {
  isHidePromotion = !isHidePromotion
  if (isHidePromotion) {
    // 숨김 처리
    promotionEl.classList.add('show');
    promotionToggleBtnIcon.innerText = 'expand_more';
  } else {
    // 보임 처리
    promotionEl.classList.remove('show');
    promotionToggleBtnIcon.innerText ='expand_less';
  }
});


// 이벤트 section에 scroll-spy 클래스가 있는 요소를 감시
const spyEls = document.querySelectorAll('section.scroll-spy');
spyEls.forEach(function (spyEl) {
  new ScrollMagic
    .Scene({
      triggerElement: spyEl, // 보여짐 여부를 감시할 요소를 지정
      triggerHook: .8, // 뷰포트(0~1) 기준으로 요소가 감시될 위치 지정
    })
    .setClassToggle(spyEl, 'show') // 해당 요소가 hook에 나타나면 클래스 추가
    .addTo(new ScrollMagic.Controller());
});


// copyright 연도 지정
const thisYear = document.querySelector('.this-year');
thisYear.textContent = new Date().getFullYear(); // 2021