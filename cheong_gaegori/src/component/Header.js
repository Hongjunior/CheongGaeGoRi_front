import '../index.css';
import './Header.css'; // Header.css를 import

export default function Header() {
  return (
    <div style={{ display: 'flex', alignItems: 'center' }}>
      <span className='logo_container'>
        <img className='logo_image' src='/cheong_logo.jpeg' alt='cute' />
      </span>
      <p>청개고리</p>
    </div>
  );
}
